import seaborn as sns
import matplotlib.pyplot as plt
import numpy as np

# 生成数据
data = np.random.rand(5, 5)

# 绘制热力图
sns.set(font_scale=1.5)
plt.figure(figsize=(10, 8))
sns.heatmap(data=data, cmap="YlGnBu", annot=True, fmt=".2f")
plt.title("Heatmap of 3D array")
plt.show()