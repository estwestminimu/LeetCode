//2619. Array Prototype Last

Array.prototype.last = function() {
    return this[this.length-1] ?? -1;
};

Array.prototype.last = function() {
    if(this.length===0)
        return -1;
    
    return this.pop();

    
};