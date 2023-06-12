import React, { useEffect, useState } from 'react';
import { getTodaysOrders,updateOrderToDone } from '../services/ApiService';

const OrdersComponent = () => {
  const [orders, setOrders] = useState([]);

  useEffect(() => {
    getTodaysOrders()
      .then(data => setOrders(data))
      .catch(error => console.log(error));
  }, []);

  const renderItems = items => {
    return items.map(item => <li key={item.details}>{item.details}</li>);
  };

  
  const handleUpdateOrderToDone = orderId => {
    updateOrderToDone(orderId)
      .then(updatedOrders => setOrders(updatedOrders))
      .catch(error => console.log(error));
  };

  return (
    <div>
      <h1>Today's Orders</h1>
      <ul>
        {orders.map(order => (
          <li key={order.id}>
            <strong>id: </strong>
            {order.id}
            <br />
            <strong>name: </strong>
            {order.name}
            <br />
            <strong>details: </strong>
            {order.details}
            <br />
            <strong>fullPrice: </strong>
            {order.fullPrice}
            <br />
            <strong>orderedDate: </strong>
            {order.orderedDate}
            <br />
            <strong>pickUpDate: </strong>
            {order.pickUpDate}
            <br />
            <strong>preOrder: </strong>
            {order.preOrder.toString()}
            <br />
            <strong>orderDone: </strong>
            {order.orderDone.toString()}
            <br />
            <strong>items: </strong>
            <ul>{renderItems(order.items)}</ul>
   
              <button onClick={() => handleUpdateOrderToDone(order.id)}>
                Mark as Done
              </button>
            
          </li>
        ))}
      </ul>
    </div>
  );
};

export default OrdersComponent;
