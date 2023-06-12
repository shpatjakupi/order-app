export const getTodaysOrders = async () => {
    const apiUrl = 'http://localhost:8080'; // Replace with your API endpoint
  
    try {
      const response = await fetch(`${apiUrl}/admin/getTodaysOrders`);
      if (!response.ok) {
        throw new Error('Failed to fetch orders');
      }
      const data = await response.json();
      return data.map(item => item.order);
    } catch (error) {
      console.log(error);
      throw error;
    }
  };
 
  export const getOrderByDate = async dateKey => {
    const apiUrl = 'http://localhost:8080'; // Replace with your API endpoint
  
    try {
      const response = await fetch(`${apiUrl}/admin/getOrdersByDate/${dateKey}`);
      if (!response.ok) {
        throw new Error('Failed to fetch orders');
      }
      const data = await response.json();
      return data.map(item => item.order);
    } catch (error) {
      console.log(error);
      throw error;
    }
  };

  export const updateOrderToDone = async orderId => {
    const apiUrl = 'http://localhost:8080'; // Replace with your API endpoint
  
    try {
      const response = await fetch(`${apiUrl}/admin/updateOrderToDone/${orderId}`, {
        method: 'PUT', // or 'POST' depending on your API endpoint
      });
      if (!response.ok) {
        throw new Error('Failed to update order');
      }
      return getTodaysOrders(); // Fetch updated order list
    } catch (error) {
      console.log(error);
      throw error;
    }
  };
 

  