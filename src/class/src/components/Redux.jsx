import { createStore } from "redux";

// Initial State
const initialState = {
  user: {
    username: "Teju",
    balance: 50000,
  },
};

// Actions
export const addMoney = (amt) => ({
  type: "addMoney",
  payload: amt,
});

export const removeMoney = (amt) => ({
  type: "removeMoney",
  payload: amt,
});

// Reducer
function reducer(state = initialState, action) {
  switch (action.type) {
    case "addMoney":
      return {
        ...state,
        user: {
          ...state.user,
          balance: state.user.balance + action.payload,
        },
      };

    case "removeMoney":
      return {
        ...state,
        user: {
          ...state.user,
          balance: state.user.balance - action.payload,
        },
      };

    default:
      return state;
  }
}

const store = createStore(reducer);
export default store;