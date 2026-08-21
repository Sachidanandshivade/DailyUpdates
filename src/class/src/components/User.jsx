import React from "react";
import { useSelector, useDispatch } from "react-redux";
import { addMoney, removeMoney } from "./components/store";

export default function UserProfile() {
  const { username, balance } = useSelector((state) => state.user);
  const dispatch = useDispatch();

  return (
    <div>
      <h2>User: {username}</h2>
      <p>Balance: ${balance}</p>
      <button onClick={() => dispatch(addMoney(500))}>Add $500</button>
      <button onClick={() => dispatch(removeMoney(200))}>Remove $200</button>
    </div>
  );
}