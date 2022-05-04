import React from "react";
import { FormControl, InputGroup } from "react-bootstrap";

export default function LabelDetalhe({name,value}) {
    return(
        <InputGroup className="mb-3">
              <InputGroup.Text id="basic-addon1">{name}:</InputGroup.Text>
              <FormControl
                placeholder={value}
                aria-label="Username"
                aria-describedby="basic-addon1"
                disabled
                size="sm"
              
              />
            </InputGroup>
    )
    
}