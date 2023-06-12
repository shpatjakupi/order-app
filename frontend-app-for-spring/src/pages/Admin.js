import { Link } from 'react-router-dom';

const Home = () => {
    return (
      <div>
        <h2>Welcome admin!</h2>
        <p>Click the button below to navigate to some orders</p>
        <Link to="/orders">
          <button>Todays order</button>
        </Link>
        <Link to="/ordersByDate">
          <button>Get order by date</button>
        </Link>
      </div>
    );
  };


  export default Home;