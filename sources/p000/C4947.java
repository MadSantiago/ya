package p000;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦۗؒؑۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4947 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final ArrayList f16369 = new ArrayList();

    /* JADX INFO: renamed from: ۥؗ */
    public WeakReference f16370;

    /* JADX INFO: renamed from: ۥۗ */
    public SparseArray f16371;

    /* JADX INFO: renamed from: ۥۣ */
    public WeakHashMap f16372;

    /* JADX INFO: renamed from: ۥۣ */
    public final View m8331(View view) {
        int size;
        WeakHashMap weakHashMap = this.f16372;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM8331 = m8331(viewGroup.getChildAt(childCount));
                    if (viewM8331 != null) {
                        return viewM8331;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                arrayList.get(size).getClass();
                C0178.m382();
            }
        }
        return null;
    }
}
