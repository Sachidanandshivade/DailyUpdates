import React from 'react'
import Greeting from './Greeting'

export default function Exam() {
  let age = 22
  let skills = ['HTML', 'CSS', 'JavaScript', 'React']
  return (
    <div>
      <h1>Welcome to props</h1>
      <Greeting name = "Aishwarya" age1 = {age} items = {skills} />
    </div>
  )
}