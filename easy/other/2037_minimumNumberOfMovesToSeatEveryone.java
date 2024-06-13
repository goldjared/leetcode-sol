// 06/13/24 12min o(n lg n)

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int moves = 0;
        for(int i = 0; i < seats.length; i++) {
            if(seats[i] == students[i]) continue;
            if(seats[i] > students[i]) 
                moves += seats[i] - students[i];
            else
                moves += students[i] - seats[i];

        }

        return moves;
        
    }
}
