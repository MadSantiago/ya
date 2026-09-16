package p000;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥًۤؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2668 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f8835;

    /* JADX INFO: renamed from: ۥُ */
    public final int f8836;

    /* JADX INFO: renamed from: ۥّ */
    public final CharSequence f8837;

    /* JADX INFO: renamed from: ۥۗ */
    public IconCompat f8838;

    /* JADX INFO: renamed from: ۥۣ */
    public final Bundle f8839;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f8840;

    /* JADX INFO: renamed from: ۦۙ */
    public final PendingIntent f8841;

    public C2668(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatM56 = IconCompat.m56(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f8840 = true;
        this.f8838 = iconCompatM56;
        if (iconCompatM56 != null) {
            int iIntValue = iconCompatM56.f178;
            if (iIntValue == -1) {
                Object obj = iconCompatM56.f176;
                if (Build.VERSION.SDK_INT >= 28) {
                    iIntValue = AbstractC2611.m4941(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                        iIntValue = -1;
                    } catch (InvocationTargetException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.f8836 = iconCompatM56.m58();
            }
        }
        this.f8837 = C3088.m5676(str);
        this.f8841 = pendingIntent;
        this.f8839 = bundle;
        this.f8835 = true;
        this.f8840 = true;
    }
}
