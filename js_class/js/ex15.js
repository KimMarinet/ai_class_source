const schedule1 = (function() {
    let year;
    
    return{
        set year(_year){
            year = _year;
        },
        get year() {
            return year;
        }
    }
})();