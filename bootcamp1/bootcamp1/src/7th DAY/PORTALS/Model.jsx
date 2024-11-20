import React from 'react';
import styles from "./form.module.css"

const  Model= () => {
  return (
    <div className={styles.form}>
    <form>
        <input type="text" placeholder='enter your name'></input><br></br>
        <input type="text" placeholder='enter mail'></input><br></br>
        <input type="text" placeholder="enter pass"></input><br></br>
        <button>submit</button>
    </form>
</div>
  )
}

export default Model