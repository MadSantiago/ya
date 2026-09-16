package p000;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: ۥؘِ۟ؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2418 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Uri f8073 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: ۥۣ */
    public static Intent m4539(Context context, C5148 c5148) throws C2627 {
        Bundle bundleCall;
        String str = c5148.f17058;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (c5148.f17057) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f8073);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e) {
                e = e;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            if (bundleCall != null) {
                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                if (intent2 != null) {
                    intent = intent2;
                } else {
                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                    if (pendingIntent != null) {
                        StringBuilder sb = new StringBuilder(str.length() + 72);
                        sb.append("Dynamic lookup for intent failed for action ");
                        sb.append(str);
                        sb.append(" but has possible resolution");
                        Log.w("ServiceBindIntentUtils", sb.toString());
                        throw new C2627(new C2612(25, pendingIntent, null));
                    }
                }
            }
            if (intent == null) {
                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
            }
        }
        return intent == null ? new Intent(str).setPackage("com.google.android.gms") : intent;
    }
}
