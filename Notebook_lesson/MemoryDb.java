public class MemoryDb implements Db {
	
	private Object data[];
	
	public MemoryDb(){    
        Object[] data = new Object[0];
    }
	
	public void save(Object obj) throws DbException{
		Object[] newData = new Object[data.length + 1];
        System.arraycopy(data, 0, newData, 0, data.length); 
        newData[newData.length - 1] = obj; 
        this.data = newData; 
	}
	
	public Object[] findAll() throws DbException{
		return this.data;
	}
}