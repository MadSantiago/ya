package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p000.AbstractC5618;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f0;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f1;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5618.f18515);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
