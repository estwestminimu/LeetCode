/**
 * @param {number[]} g
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    //JS sorts by string
    g.sort((a,b)=> a-b);
    s.sort((a,b)=> a-b);
    let i=0, j=0;
    
    while(i<g.length)
    {
        //We're looking for the next cookie
        while( j<s.length && g[i]>s[j])
        {
            j+=1;
        }
        if(j==s.length)
        {
            break;
        }
        j++;
        i++;
    }

    return i;

};