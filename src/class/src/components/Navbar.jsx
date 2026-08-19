import React from 'react'
import { Link } from 'react-router-dom'
import Greeting from './Greeting'
import Memo from './Memo'
import Reference from './Reference'

export default function Navbar() {
  return (
    <div>
      {/* <a href='#'>Link</a> */}
      <Link to="/Greeting">Home</Link>
      <hr></hr>
      <Link to="/Memo">Calculate</Link>
      <hr></hr>
      <Link to="/Reference">Edit</Link>
    </div>
  )
}