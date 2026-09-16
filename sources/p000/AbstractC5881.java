package p000;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ۦۨؔۥۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5881 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Field f19412;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f19412 = declaredField;
    }
}
