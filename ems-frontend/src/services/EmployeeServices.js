import React from 'react'
import axios from 'axios'

const REST_API_BASE_URL='http://localhost:8080/api/employees';
const REST_API_GET_URL='http://localhost:8080/api/employees/get-all';
const REST_API_POST_URL='http://localhost:8080/api/employees/post';

export const listEmployees=()=> axios.get(REST_API_GET_URL);

export const createEmployee=(employee)=> axios.post(REST_API_POST_URL,employee);

export const getEmployee=(employeeId)=> axios.get(REST_API_BASE_URL+'/'+employeeId);

export const updateEmployee=(employeeId,employee)=> axios.put(REST_API_BASE_URL+'/'+employeeId,employee);

export const deleteEmployee=(employeeId)=>axios.delete(REST_API_BASE_URL+'/'+employeeId);




