import { Container, Row } from "react-bootstrap";
// import Books from "./components/Book/Books";
import Members from "./components/Member/Members";

//import { Counter } from "./components/Counter/hooks/Counter";
// import { BookList } from "./components/Book/BookList";
//import CounterComponent from "./components/Counter/CounterComponent";
/* import HelloWorld3 from "./HelloWorld"


// function component
function HelloWorld(props) {
  return <p>Hello World dari function component</p>
}

// arrow function component
const HelloWorld2 = () => {
  return <p>Hello World dari arrow function component</p>
} */

/* const freezers = ['Mango', 100, true];
freezer.forEach(freez => console.log(freez));

const students = [
  {
    id: 12345678,
    name: 'Alfian',
    gender: 'Male'
  },
  {
    id: 2345678,
    name: 'Jessica',
    gender: 'Female'
  }
];

students.map(student => console.log(student.name));
 */

function App() {
  /*   const fullName = 'Alfian Hidayatulloh';
  
  const buttonText = 'Submit';

  const buttonStyle = { backgroundColor: 'black', color: 'white' };
  
  const summation = <p>Hasil dari 5 + 5 adalah {5+5}</p>; */

  return (
    /*    <div className="App">
      <h1>Hai, {fullName}</h1>
      <hr />
      <label className="label" htmlFor="name">Masukkan usia Anda</label>
      <input type="text" id="name" />
      <button style={buttonStyle}>{buttonText}</button>
      <hr />
      {summation}
      <hr />
      <HelloWorld />
      <HelloWorld2 />
      <HelloWorld3 />
    </div> */
    <Container>
      <Row>
        {/*         <BookComponent
          title="Warkop DKI Reborn 1"
          // title={"Warkop DKI Reborn"}
          description="Warkop DKI Reborn description"
          variant="success"
        />
        <BookComponent
          title="Warkop DKI Reborn 2"
          description="Warkop DKI Reborn description"
          variant="success"
        />
        <BookComponent
          title="Warkop DKI Reborn 3"
          description="Warkop DKI Reborn description"
          variant="success"
        />
        <BookComponent
          title="Warkop DKI Reborn 4"
          description="Warkop DKI Reborn description"
          variant="success"
        />
        <BookComponent
          title="Warkop DKI Reborn 5"
          description="Warkop DKI Reborn description"
          variant="success"
        />
        <BookComponent
          title="Warkop DKI Reborn 6"
          description="Warkop DKI Reborn description"
          variant="success"
        /> */}
        {/* <BookList />
        <CounterComponent />
        <Counter />
        <Books /> */}
        <Members />
      </Row>
    </Container>
  );
}

export default App;
