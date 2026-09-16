package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦؘۣ۠ؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5425 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Method f17905;

    /* JADX INFO: renamed from: ۥۗ */
    public static final Method f17906;

    /* JADX INFO: renamed from: ۥۣ */
    public static final Method f17907;

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f17908;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f17907 = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f17906 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f17905 = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f17908 = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
