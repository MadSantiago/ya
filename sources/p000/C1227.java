package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: renamed from: ۥؚْؖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1227 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f4224;

    public /* synthetic */ C1227(int i) {
        this.f4224 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m2592(Object obj, C1765 c1765) throws PackageManager.NameNotFoundException {
        String str;
        String authority;
        switch (this.f4224) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (AbstractC0080.m7958(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                str = path != null ? path : "";
                if (str.length() <= 0 || !AbstractC2133.m4157(str.charAt(0), '/', false) || ((String) AbstractC0973.m2058(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!AbstractC3831.m6874(uri.getScheme(), "file")) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0774) obj).f2803;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                int iIntValue = ((Number) obj).intValue();
                Context context = c1765.f5881;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Uri uri2 = (Uri) obj;
                if (!AbstractC3831.m6874(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC0684.m1534(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                str = authority2 != null ? authority2 : "";
                Resources resourcesForApplication = c1765.f5881.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier == 0) {
                    C5028.m8445(uri2, "Invalid android.resource URI: ");
                    return null;
                }
                return Uri.parse("android.resource://" + str + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
