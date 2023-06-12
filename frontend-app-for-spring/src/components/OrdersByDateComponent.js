import React, { useEffect, useState } from 'react';
import { getOrderByDate } from '../services/ApiService';

const OrdersComponent = () => {
  const [orders, setOrders] = useState([]);
  const [selectedDate, setSelectedDate] = useState('TODAY');

  useEffect(() => {
    handleGetOrderByDate(selectedDate);
  }, [selectedDate]);

  const handleGetOrderByDate = dateKey => {
    getOrderByDate(dateKey)
      .then(orders => setOrders(orders))
      .catch(error => console.log(error));
  };

  const renderItems = items => {
    return items.map(item => <li key={item.details}>{item.details}</li>);
  };

  const handleChangeDate = event => {
    setSelectedDate(event.target.value);
  };

  return (
    <div>
      <label htmlFor="date">Choose a date:</label>
      <select name="date" id="date" onChange={handleChangeDate} value={selectedDate}>
        <option value="TODAY">Today</option>
        <option value="YESTERDAY">Yesterday</option>
        <option value="THIS_WEEK">This week</option>
        <option value="LAST_WEEK">Last week</option>
        <option value="THIS_MONTH">This month</option>
        <option value="LAST_MONTH">Last month</option>
      </select>
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
          </li>
        ))}
      </ul>
    </div>
  );
};

export default OrdersComponent;
