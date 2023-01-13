import React from 'react'

function NoJSX() {
//   return (
//     <div>
//       <h1>Within the JSX</h1>
//     </div>
//   )

    return React.createElement("div",null,React.createElement("h1",null,"Without using JSX"))

}

export default NoJSX
