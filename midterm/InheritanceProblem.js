"use strict";

(function () {
    function Employee(id) {
        this.id = id;
        this.name = 'Default';
        this.employer = {name: 'MUM'};
    }

    Employee.prototype.getName = function(){
        return this.name;
    }

    Employee.prototype.getEmployeeName = function () {
        return this.name.employer.name;
    }

    var john = new Employee(980000);

})();