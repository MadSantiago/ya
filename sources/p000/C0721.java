package p000;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;

/* JADX INFO: renamed from: ۥؙْؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0721 {

    /* JADX INFO: renamed from: ۥؗ */
    public final File f2629;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f2630 = false;

    /* JADX INFO: renamed from: ۥّ */
    public C2754[] f2631;

    /* JADX INFO: renamed from: ۥۗ */
    public final byte[] f2632;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3121 f2633;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f2634;

    /* JADX INFO: renamed from: ۦۙ */
    public byte[] f2635;

    public C0721(AssetManager assetManager, ExecutorC4322 executorC4322, C3121 c3121, String str, File file) {
        byte[] bArr;
        this.f2633 = c3121;
        this.f2634 = str;
        this.f2629 = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = AbstractC2133.f7004;
                    break;
                case 27:
                    bArr = AbstractC2133.f6998;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC2133.f7006;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC2133.f6996;
        }
        this.f2632 = bArr;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1594(int i, Serializable serializable) {
        new RunnableC3255(i, 0, this, serializable).run();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final FileInputStream m1595(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
            return null;
        }
    }
}
