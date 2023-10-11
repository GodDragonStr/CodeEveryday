import torch
import matplotlib.pyplot as plt
import numpy as np

# 加载预训练的模型和示例图像
import torchvision.models as models
import torchvision.transforms as transforms
from PIL import Image

# 加载预训练的ResNet模型
model = models.resnet18(pretrained=True)
model = model.eval()

# 选择示例图像，对图像进行预处理
img_path = './CVCode/visual/Corgi.png'  # 替换为你自己的图像文件路径
img = Image.open(img_path)
preprocess = transforms.Compose([transforms.Resize((224, 224)),
                                 transforms.ToTensor(),
                                 transforms.Normalize(mean=[0.485, 0.456, 0.406], std=[0.229, 0.224, 0.225])])
img_tensor = preprocess(img)
img_tensor = img_tensor.unsqueeze(0)  # 添加批次维度

# 获取中间特征图
def get_interested_layers(model):
    # 这里选择ResNet的第四层卷积层，你可以根据你的模型选择感兴趣的层
    return model.layer4

interested_layers = get_interested_layers(model)

def plot_feature_maps(img, model):
    activation = img
    activations = [img]

    for name, layer in model.named_children():
        activation = layer(activation)
        activations.append(activation)
        if name in [f"layer{i+1}" for i in range(4)]:
            print(name.center(20, '-'))
            plt.figure()
            plt.imshow(np.mean(activation[0].detach().numpy(), axis=0), cmap='viridis')
            plt.show()

    # # 可视化中间特征图
    # for i, feature_map in enumerate(activations):
    #     if i != 0:
    #         plt.figure()
    #         plt.imshow(np.mean(feature_map[0].detach().numpy(), axis=0), cmap='viridis')
    #         plt.title(f"Layer {i}")

plot_feature_maps(img_tensor, model)

# plt.show()


# for name, layer in model.named_children():
#     print(name)
#     print(layer)
