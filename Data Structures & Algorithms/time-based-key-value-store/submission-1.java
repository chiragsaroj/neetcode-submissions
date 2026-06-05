class TimeStampedValue{
    public int timestamp;
    public String value;

    public TimeStampedValue(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    Map<String, ArrayList<TimeStampedValue>> entries;

    public TimeMap() {
        entries = new HashMap<>();   
    }
    
    public void set(String key, String value, int timestamp) {
        if(!entries.containsKey(key)){
            entries.put(key, new ArrayList<>());
        }

        ArrayList<TimeStampedValue> newTsv = entries.get(key);
        newTsv.add(new TimeStampedValue(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!entries.containsKey(key)) return "";

        ArrayList<TimeStampedValue> list = entries.get(key);

        int low = 0, high = list.size() - 1;
        String result = "";

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid).timestamp <= timestamp) {
                result = list.get(mid).value;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
