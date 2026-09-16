package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۦؙؚؓٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3533 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final ExecutorC2205 f11724 = new ExecutorC2205(new ExecutorC3678(1));

    /* JADX INFO: renamed from: ۦ۟ */
    public static int f11723 = -100;

    /* JADX INFO: renamed from: ۥْ */
    public static C1257 f11717 = null;

    /* JADX INFO: renamed from: ۥٓ */
    public static C1257 f11718 = null;

    /* JADX INFO: renamed from: ۥَ */
    public static Boolean f11716 = null;

    /* JADX INFO: renamed from: ۥٖ */
    public static boolean f11719 = false;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C1821 f11721 = new C1821(0);

    /* JADX INFO: renamed from: ۦۛ */
    public static final Object f11722 = new Object();

    /* JADX INFO: renamed from: ۥۖ */
    public static final Object f11720 = new Object();

    /* JADX INFO: renamed from: ۥّ */
    public static void m6322(LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852) {
        synchronized (f11722) {
            try {
                C1821 c1821 = f11721;
                c1821.getClass();
                C1102 c1102 = new C1102(c1821);
                while (c1102.hasNext()) {
                    AbstractC3533 abstractC3533 = (AbstractC3533) ((WeakReference) c1102.next()).get();
                    if (abstractC3533 == layoutInflaterFactory2C1852 || abstractC3533 == null) {
                        c1102.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m6323(Context context) {
        if (f11716 == null) {
            try {
                int i = AbstractServiceC1618.f5426;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1618.class), AbstractC4818.m8194() | 128).metaData;
                if (bundle != null) {
                    f11716 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f11716 = Boolean.FALSE;
            }
        }
        return f11716.booleanValue();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m6324(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f11723 != i) {
            f11723 = i;
            synchronized (f11722) {
                try {
                    C1821 c1821 = f11721;
                    c1821.getClass();
                    C1102 c1102 = new C1102(c1821);
                    while (c1102.hasNext()) {
                        AbstractC3533 abstractC3533 = (AbstractC3533) ((WeakReference) c1102.next()).get();
                        if (abstractC3533 != null) {
                            ((LayoutInflaterFactory2C1852) abstractC3533).m3665(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract void mo3642();

    /* JADX INFO: renamed from: ۥُ */
    public abstract void mo3645();

    /* JADX INFO: renamed from: ۥۜ */
    public abstract boolean mo3652(int i);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo3653();

    /* JADX INFO: renamed from: ۦٌ */
    public abstract void mo3658(CharSequence charSequence);

    /* JADX INFO: renamed from: ۦِ */
    public abstract void mo3659(View view);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract void mo3663(int i);

    /* JADX INFO: renamed from: ۦۗ */
    public abstract void mo3664(View view, ViewGroup.LayoutParams layoutParams);
}
