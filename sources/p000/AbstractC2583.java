package p000;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥؘۡؑؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2583 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2094 f8628 = new C2094(2);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1068 f8627 = new C1068(4);

    /* JADX INFO: renamed from: ۥؗ */
    public static C5056[] m4877(Context context, C0223 c0223, String str) {
        String[] strArr;
        Trace.beginSection(AbstractC5568.m9363("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(AbstractC5568.m9363("ContentQueryWrapper.query"));
                try {
                    String str2 = c0223.f829;
                    String str3 = c0223.f827;
                    if (str2 == null) {
                        strArr = new String[]{str3};
                        break;
                    }
                    int length = str2.length();
                    int iCharCount = 0;
                    while (true) {
                        if (iCharCount >= length) {
                            strArr = new String[]{str3};
                            break;
                        }
                        int iCodePointAt = str2.codePointAt(iCharCount);
                        if (!Character.isWhitespace(iCodePointAt)) {
                            strArr = new String[]{str3, "VF"};
                            break;
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    String[] strArr3 = strArr;
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr2, "query = ?", strArr3, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList.add(new C5056(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, c0223.f829, i));
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    C5056[] c5056Arr = (C5056[]) arrayList.toArray(new C5056[0]);
                    Trace.endSection();
                    return c5056Arr;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static ProviderInfo m4878(PackageManager packageManager, C0223 c0223, Resources resources) {
        C1068 c1068 = f8627;
        C2094 c2094 = f8628;
        Trace.beginSection(AbstractC5568.m9363("FontProvider.getProvider"));
        try {
            List listM3404 = c0223.f832;
            String str = c0223.f831;
            String str2 = c0223.f830;
            if (listM3404 == null) {
                listM3404 = AbstractC1631.m3404(resources, 0);
            }
            C0748 c0748 = new C0748();
            c0748.f2725 = str;
            c0748.f2724 = str2;
            c0748.f2723 = listM3404;
            ProviderInfo providerInfo = (ProviderInfo) c2094.m4035(c0748);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c1068);
            for (int i = 0; i < listM3404.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM3404.get(i));
                Collections.sort(arrayList2, c1068);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            c2094.m4041(c0748, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0918 m4879(Context context, List list) {
        String str;
        Typeface typefaceM5897;
        Trace.beginSection(AbstractC5568.m9363("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C0223 c0223 = (C0223) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM5897 = AbstractC3211.m5897((str = c0223.f828))) == null || AbstractC3211.m5900(typefaceM5897) == null) {
                    ProviderInfo providerInfoM4878 = m4878(context.getPackageManager(), c0223, context.getResources());
                    if (providerInfoM4878 == null) {
                        return new C0918(0);
                    }
                    arrayList.add(m4877(context, c0223, providerInfoM4878.authority));
                } else {
                    arrayList.add(new C5056[]{new C5056(str, c0223.f829)});
                }
            }
            C0918 c0918 = new C0918();
            c0918.f3292 = 0;
            c0918.f3293 = arrayList;
            return c0918;
        } finally {
            Trace.endSection();
        }
    }
}
