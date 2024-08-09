// 30 min o(n)
int[] solution(int[] numbers) {
    /*
    a, b, c 
    b > both
    b < both
        = 1
    all same = 0 (no zag)
    
    [1,2,1,3,4]
    l, r
    when r = num.length, end
    */
    List<Integer> list = new ArrayList<>();
    int l = 0;
    int r = 2;
    while(r < numbers.length) {
        int a = numbers[l];
        int b = numbers[l + 1];
        int c = numbers[r];
        if(b > a && b > c) list.add(1);
        else if(b < a && b < c) list.add(1);
        else list.add(0);
        
        l++;
        r++;
    }
    
    int[] arr = new int[list.size()];
    for(int i = 0; i < list.size(); i++) {
        arr[i] = list.get(i);
    }
    
    return arr;

}
