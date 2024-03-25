import torch  
  
t = torch.tensor([[1, 2], [3, 4], [5, 6]])  
index = torch.tensor([0, 2, 1])  
  
result = t.gather(0, index)