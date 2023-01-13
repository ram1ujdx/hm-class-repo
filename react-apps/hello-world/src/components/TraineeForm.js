import React, { Component } from 'react'




export class TraineeForm extends Component {

    constructor(props) {
        super(props)

        this.state = {
            traineeName: '',
            salary: 0,
            traineeNameValid:false,
            salaryValid:false,
            formValid:false,
            touched:false

        }
    }

    render() {
        const traineeNameError = this.state.touched && !this.state.traineeNameValid && <p className='text-danger'>Invalid Name</p>
        const salaryError = this.state.touched && !this.state.salaryValid && <p className='text-danger'>Invalid Salary</p>
        return (
            <div>
                <form onSubmit={(event)=>this.submitForm(event)} className='traineeForm'>
                    <div className='form-group'>
                        <label className='form-label' htmlFor='traineeName'>Name</label>
                        <input type='text' className='form-control' name='traineeName' value={this.state.traineeName} onChange={(event) => this.handleInputs(event)} />
                        {traineeNameError}
                       
                    </div>
                    <div className='form-group'>
                        <label className='form-label' htmlFor='salary'>Salary</label>
                        <input type='number' className='form-control' name='salary' value={this.state.salary} onChange={(event) => this.handleInputs(event)} />
                        {salaryError}
                    </div>
                    <button type='submit' className='btn btn-primary' disabled={!this.state.formValid} >Submit</button>
                </form>
            </div>
        )
    }


    handleInputs(e) {
      
        const name = e.target.name;
        const value = e.target.value;

        this.setState({
            [name]:value,
            touched:true
        },()=>this.validateInputs(name,value))

    }

    validateInputs(input,value){
        if(input === 'traineeName'){
            this.setState({
                traineeNameValid:value.length>=3
            })
        }
        else if(input === 'salary'){
            this.setState({
                salaryValid:value>0
            })
        }
        this.setState({
        },()=>this.validateForm()
        )
    }

    validateForm(){
        this.setState({
            formValid: this.state.traineeNameValid && this.state.salaryValid
        })
        console.log(this.state)
    }

    submitForm(event){
       
        console.log("Form Submitted Successfully")
    }

}

export default TraineeForm
