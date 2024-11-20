import React from "react";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import Layout from "./Layout";
import Home from "./Home";
import Products from "./Products";
import Login from "./Login";
import About1 from "./About1";

let r=createBrowserRouter([
    {
        path:"/",
        element:<Layout/>,
        children:[
            {
                path:"/home",
                element:<Home/>
            },
            {
                path:"/products",
                element:<Products/>
            },
            {
                path:"/login",
                element:<Login/>
            },
            {
                path:"/about",
                element:<About1/>
            },
        ]
    }
]);

const AppRoute = () => {
  return (
    <RouterProvider router={r}></RouterProvider>
  )
}

export default AppRoute