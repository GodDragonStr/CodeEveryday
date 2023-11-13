from PIL import Image

def concatenate_images(images, output_path, orientation='horizontal'):
    """
    将多个图片拼接在一起

    参数：
    images: 包含图片路径的列表
    output_path: 输出拼接后图片的路径
    orientation: 拼接方向，'horizontal'表示水平拼接，'vertical'表示垂直拼接

    返回：
    无
    """
    if not images:
        print("图片列表为空，无法拼接。")
        return

    # 打开第一张图片，用于获取宽度和高度
    first_image = Image.open(images[0])
    width, height = first_image.size

    # 创建一个新的图片，根据拼接方向设置宽度和高度
    if orientation == 'horizontal':
        new_image = Image.new('RGB', (width * len(images), height))
    elif orientation == 'vertical':
        new_image = Image.new('RGB', (width, height * len(images)))
    else:
        print("无效的拼接方向。")
        return

    # 将每张图片粘贴到新的图片上
    for i, image_path in enumerate(images):
        img = Image.open(image_path)
        if orientation == 'horizontal':
            new_image.paste(img, (i * width, 0))
        elif orientation == 'vertical':
            new_image.paste(img, (0, i * height))

    # 保存拼接后的图片
    new_image.save(output_path)

# 示例用法
image_paths = ["image1.jpg", "image2.jpg", "image3.jpg"]
output_path_horizontal = "concatenated_horizontal.jpg"
output_path_vertical = "concatenated_vertical.jpg"

concatenate_images(image_paths, output_path_horizontal, orientation='horizontal')
concatenate_images(image_paths, output_path_vertical, orientation='vertical')
