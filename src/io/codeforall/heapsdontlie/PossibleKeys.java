package io.codeforall.heapsdontlie;

public enum PossibleKeys {
    Q('q'),
    W('w'),
    E('e'),
    R('r'),
    T('t'),
    Y('y'),
    U('u'),
    I('i'),
    O('o'),
    P('p'),
    A('a'),
    S('s'),
    D('d'),
    F('f'),
    G('g'),
    H('h'),
    J('j'),
    K('k'),
    L('l'),
    Z('z'),
    X('x'),
    C('c'),
    V('v'),
    //B('b'),
    N('n'),
    M('m');

    char key;
    PossibleKeys(char key){
        this.key = key;
    }
    public char getKey(){
        return key;
    }
}
