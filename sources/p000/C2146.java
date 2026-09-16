package p000;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۘؒۤؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2146 extends ViewGroup {

    /* JADX INFO: renamed from: ۥَ */
    public int f7024;

    /* JADX INFO: renamed from: ۥْ */
    public final ArrayList f7025;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2346 f7026;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f7027;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f7028;

    public C2146(Context context) {
        super(context);
        this.f7028 = 5;
        ArrayList arrayList = new ArrayList();
        this.f7027 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f7025 = arrayList2;
        this.f7026 = new C2346(3);
        setClipChildren(false);
        C5273 c5273 = new C5273(context);
        addView(c5273);
        arrayList.add(c5273);
        arrayList2.add(c5273);
        this.f7024 = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
