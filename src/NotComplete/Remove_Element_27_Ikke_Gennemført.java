package NotComplete;

public class Remove_Element_27_Ikke_Gennemført {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int result = 0;
        int notEToVal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                notEToVal++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp[i] = nums[i];
                //add at hvis temp i ikke er lig til nums, så tilføjes de til temp array, og til slut sættes temp array = nums arrayet

            }
            else if (nums[i] == val) {
                result++;
                temp[i] = nums[notEToVal];
                notEToVal++;
            }


        }
        nums = temp;
        return result;
    }
}
