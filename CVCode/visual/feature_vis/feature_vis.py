import torch
import numpy as np

import matplotlib.pyplot as plt

x1 = torch.load('./x1_feature.pt')
x2 = torch.load('./x2_feature.pt')

print(x1[0].shape)

y1 = x1[0].reshape(64, 64, 64)
y1 = y1.detach().cpu().numpy()
print(type(y1), y1.shape)
y1 = np.mean(y1, axis=2)
max1 = np.abs(y1.max())
y1 = np.abs(np.stack([y1, y1, y1], axis=2) / max1)
y1 = y1 / y1.max()

print(y1.max())
print(y1.min())

# print(type(y1), y1.shape)

plt.imshow(y1)
plt.show()
# plt.imsave('./vis_y1', y1)