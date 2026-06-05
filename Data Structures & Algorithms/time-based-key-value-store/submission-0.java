class TSVal{
    public int timestamp;
    public String value;

    public TSVal(int timestamp, String value){
        this.timestamp = timestamp;
        this.value = value;
    }
}

class TimeMap {
    Map<String, ArrayList<TSVal>> entries;

    public TimeMap() {
        entries = new HashMap<>();   
    }
    
    public void set(String key, String value, int timestamp) {
        if(!entries.containsKey(key)){
            entries.put(key, new ArrayList<>());
        }

        ArrayList<TSVal> newTsv = entries.get(key);
        newTsv.add(new TSVal(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!entries.containsKey(key)) return "";

        ArrayList<TSVal> tsv = entries.get(key);
        Optional<TSVal> resultTimeStamp = binarySearchTimeStamp(tsv, timestamp);

        if(resultTimeStamp.isEmpty()) return "";

        return resultTimeStamp.get().value;
    }

    private Optional<TSVal> binarySearchTimeStamp(ArrayList<TSVal> arr, int target){
        int low = 0, high = arr.size() - 1;
        int matchIndex = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            TSVal curr = arr.get(mid);

            if(curr.timestamp <= target){
                matchIndex = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        if(matchIndex == -1){
            return Optional.empty();
        }

        return Optional.of(arr.get(matchIndex));
    }
}
