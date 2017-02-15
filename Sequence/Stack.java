public class Stack implements Sequence {
	
	private Object[] objArr;
    private int size;
	private int maxSize;
	private int indexBegin;
	private int indexEnd;
	
	public Stack(int maxSize){
        
		this.maxSize = maxSize;
		objArr = new Object[maxSize];
        size = 0;
        indexBegin = 0;
        indexEnd = -1;
        
    }
  
    @Override
    public void add(Object obj){
		
		if (size == maxSize) {
            throw new SequenceSizeExceededException("Sequence Size Exceeded");
        }
        else {
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
				
            throw new InvalidOperationException("The stack is empty");
				
		}
		
		else{
			
			indexEnd--;
            size--;
			Object obj = objArr[indexEnd];
            objArr[size - 1] = null;
            return obj;
			
		}
    }
    
    @Override
    public Object peek(){
		
       if (size == 0){
				
            throw new InvalidOperationException("The stack is empty");
				
		}
		
		else{

            return objArr[indexEnd];
			
		}
        
    }
}