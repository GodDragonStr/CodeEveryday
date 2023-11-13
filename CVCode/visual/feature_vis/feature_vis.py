import torch
import numpy as np
import seaborn as sns

import matplotlib.pyplot as plt

x1 = torch.load(r'CVCode\visual\feature_vis\x1_feature.pt')
x2 = torch.load(r'CVCode\visual\feature_vis\x2_feature.pt')


print(x1[0].shape)

x1[0] = x1[0].detach().to("cpu")

y1 = x1[0].reshape(64, 64, 64)
print(y1.shape)
y1_mean = torch.mean(torch.abs(y1), dim=0, keepdim=True)
print(y1_mean.shape)
y1_squeeze = torch.squeeze(y1_mean)
print(y1_squeeze.shape)
y1_numpy = y1_squeeze.numpy()
print(y1_numpy.shape , type(y1_numpy))

sns.set(font_scale=1.5)
plt.figure(figsize=(10, 8))
# sns.heatmap(data=y1_numpy, cmap="YlGnBu", annot=False, fmt=".2f")
sns.heatmap(data=y1_numpy, cmap="YlGnBu", annot=False)
plt.title("Feature map")
plt.show()