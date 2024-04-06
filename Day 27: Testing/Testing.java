static class TestDataEmptyArray {
    	// Returns an empty array.
        public static int[] get_array() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
    	// Returns an array of size at least 2 with all unique elements
        public static int[] get_array() {
            return new int[]{5,8,2,4};
        }

        // Returns the expected minimum value index for this array
        public static int get_expected_result() {
            return 2;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
    	// Returns an array where there are exactly two different minimum values
        public static int[] get_array() {
            return new int[]{5,3,9,1,1,5,6,7};
        }

        // Returns the expected minimum value index for this array.
        public static int get_expected_result() {
            return 3;
        }
    }
