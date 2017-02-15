public class Queue implements Sequence {
	
	private Object[] objArr;
    private int size;
	private int maxSize;
	private int indexBegin;
	private int indexEnd;
	
	public Queue(maxSize){
        
        this.objArr = new Object[maxSize];
    }
    
    @Override
    public void add(Object obj){
        
		if (size == maxSize) {
            throw new SequenceSizeExceededException("Sequence Size Exceeded");
        }
		else{
		indexEnd++;
		objArr[indexEnd] = obj;
        size++;
		}
    }

    @Override
    public int size(){
        
        return this.size;
    }
    
	@Override
    public Object pop(){
            
        if (size == 0){
				
            throw new InvalidOperationException("The queue is empty");		
		}
		
		else{
			
			Object obj = objArr[indexEnd];
            for ( int i = indexBegin + 1; i < size; i++){
                objArr[i - 1] = data[i];
			}
            objArr[size - 1] = null;
            return obj;
			size--;
			indexEnd--;
		}
    }
	
    @Override
    public Object peek(){
		
       if (size == 0){
				
            throw new InvalidOperationException("The queue is empty");		
		}
		
		else{

            return this.objArr[indexBegin];
		}
        
    }
}
