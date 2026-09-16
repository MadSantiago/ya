package p000;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.util.Log;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: renamed from: ۦؘۚؕۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5183 {
    /* JADX INFO: renamed from: ۥؗ */
    public static AutofillId m8784(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m8785(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m8786(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static String m8787(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m8788(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static ContentCaptureSession m8789(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static ViewStructure m8790(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m8791(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m8792(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m8793(Resources.Theme theme) {
        theme.rebase();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static Insets m8794(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m8795(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m8796(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m8797(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m8798(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            C1984 c1984M3874 = C1984.m3874();
            String str = SystemForegroundService.f273;
            if (c1984M3874.f6551 <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            C1984 c1984M3875 = C1984.m3874();
            String str2 = SystemForegroundService.f273;
            if (c1984M3875.f6551 <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }
}
