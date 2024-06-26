import { useState } from 'react';
import './App.css';
import { Card } from './components/card/card';
import { CreateModal } from './components/create-modal/create-modal';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const { data } = useFoodData();
  const [isModalOpen, setIsModalOpen] = useState(false);

  const handleOpenModal = () => {
    setIsModalOpen(!isModalOpen)
  }

  return (
      <div className='container'>
        <h1>Menu Project</h1>
        <div className="card-grid">
          {data?.map((item) => 
            <Card key={item.id}
              price={item.price} 
              title={item.title} 
              image={item.image}/>
          )}
        </div>
        {isModalOpen && <CreateModal closeModal={handleOpenModal}/>}
        <button onClick={handleOpenModal} className="btn-primary">New Item</button>
      </div>
  )
}

export default App
