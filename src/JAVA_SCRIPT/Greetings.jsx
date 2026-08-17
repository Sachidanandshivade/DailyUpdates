import React from 'react'

export default function Greeting(props) {
  return (
    <div>
      <h2>Good Afternoon {props.name} !</h2>
      <h2>{props.name}'s age is {props.age1}!</h2>
      <h2>{props.name}'s skills are: {props.items.join(', ')}</h2>
    </div>
  )
}