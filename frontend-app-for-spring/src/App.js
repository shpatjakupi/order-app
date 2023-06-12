import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import { OrdersComponent,OrdersByDateComponent} from './components';
import {Admin,Layout} from './pages';
import 'bootstrap/dist/css/bootstrap.min.css';


const App = () => {
  return (
    <Router>
      <Layout>
        <Routes>
          <Route path="/admin" element={<Admin />} />
          <Route path="/orders" element={<OrdersComponent />} />
          <Route path="/OrdersByDate" element={<OrdersByDateComponent />} />
          <Route path="/order" element={<OrdersByDateComponent />} />
        </Routes>
      </Layout>
    </Router>
  );
};

export default App;
