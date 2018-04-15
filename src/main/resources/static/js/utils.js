/**
 * js工具包
 */

/**
 * f_num 待格式化的浮点数
 * format_length 保留几位小数（不够的拿 0填充）
 * RoundOf boolean是否进行四舍五入（true：是 false：否）
 * return string
 **/
function formatFloat(f_num, format_length, RoundOf) {
    if (format_length <= 0) return f_num + '';
    f_num += ".0";
    var array = f_num.split(".");
    if (array[1].length > format_length) {
        if (RoundOf) {
            var n = array[1].substring(format_length, format_length + 1);
            if (parseInt(n) > 4) {
                array[1] = array[1].substring(0, format_length);
                array[1] = parseInt(array[1]) + 1 + '';
                return array[0] + '.' + array[1];
            }
        } else {
            array[1] = array[1].substring(0, format_length);
            return array[0] + '.' + array[1];
        }
    } else {
        var n = format_length - array[1].length;
        for (var i = 0; i < n; i++) {
            array[1] += '0';
        }
        return array[0] + '.' + array[1];
    }
}

/**
 * 比较 2个对象是否相等
 * @param x
 * @param y
 * @return {boolean}
 */
function cmp(x, y) {
    // 如果 x，y都是 null、undefined或者完全相等
    if (x === y) {
        return true;
    }

    // 如果不完全相等就必须是对象
    if (! ( x instanceof Object) || !( y instanceof Object)) {
        return false;
    }

    // 它们必须有完全相同的原型链，我们只能通过测试构造函数来判断
    if (x.constructor !== y.constructor) {
        return false;
    }

    for (var p in x) {
        //Inherited properties were tested using x.constructor === y.constructor
        if (x.hasOwnProperty(p)) {
            // Allows comparing x[ p ] and y[ p ] when set to undefined
            if (!y.hasOwnProperty(p)) {
                return false;
            }

            // If they have the same strict value or identity then they are equal
            if (x[p] === y[p]) {
                continue;
            }

            // Numbers, Strings, Functions, Booleans must be strictly equal
            if ( typeof(x[p]) !== "object") {
                return false;
            }

            // Objects and Arrays must be tested recursively
            if (!Object.equals(x[p], y[p])) {
                return false;
            }
        }
    }

    for (p in y) {
        // allows x[p] to be set to undefined
        if(y.hasOwnProperty( p ) && ! x.hasOwnProperty(p)) {
            return false;
        }
    }
    return true;
}

/**
 * 日期格式化
 * @param fmt 样式
 * @return {*}
 * @constructor
 */
function dateFormat(date, format) {
    var obj_regex = {
        "y+": date.getFullYear(),//年份
        "M+": date.getMonth() + 1, //月份
        "d+": date.getDate(), //日
        "h+": date.getHours(), //小时
        "m+": date.getMinutes(), //分
        "s+": date.getSeconds(), //秒
        "q+": Math.floor((date.getMonth() + 3) / 3), //季度
        "S": date.getMilliseconds() //毫秒
    };
    //if (/(y+)/.test(format)) format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var i in obj_regex) {
        if (new RegExp("(" + i + ")").test(format)) {
            format = format.replace(RegExp.$1, obj_regex[i]);
            //(RegExp.$1.length == 1) ? (obj_regex[i]) : (("00" + obj_regex[i]).substr(("" + obj_regex[i]).length))
        }
    }
    return format;
}

/**
 * 手机号码验证
 * @param phone
 * @returns {boolean}
 */
function mobilePhoneVerify(phone) {
    if (phone.length == 11) {
        var regex = /^(?:134|135|136|137|138|139|150|151|152|157|158|159|182|183|184|187|178|188|130|131|132|155|156|176|185|186|133|153|177|180|181|189|199|198|166){1}\d{8}/;
        if (phone.match(regex) != null) {
            return true;
        }
    }
    return false;
}