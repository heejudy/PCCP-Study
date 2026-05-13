function solution(sizes) {
    let maxWidth = 0;
    let maxHeight = 0;

    sizes.forEach(([w, h]) => {
        const currentW = Math.max(w, h);
        const currentH = Math.min(w, h);

        if (currentW > maxWidth) maxWidth = currentW;
        if (currentH > maxHeight) maxHeight = currentH;
    });

    return maxWidth * maxHeight;
}
