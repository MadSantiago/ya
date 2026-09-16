package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۦٜؖؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4698 implements InterfaceC5288 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1765 f15492;

    /* JADX INFO: renamed from: ۥۗ */
    public final Uri f15493;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f15494;

    public /* synthetic */ C4698(Uri uri, C1765 c1765, int i) {
        this.f15494 = i;
        this.f15493 = uri;
        this.f15492 = c1765;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c0  */
    @Override // p000.InterfaceC5288
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo580(InterfaceC0443 interfaceC0443) throws XmlPullParserException, IOException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer numM8358;
        Drawable drawable;
        int i = this.f15494;
        Uri uri = this.f15493;
        C1765 c1765 = this.f15492;
        boolean z = true;
        switch (i) {
            case 0:
                String strM2056 = AbstractC0973.m2056(AbstractC0973.m2038(uri.getPathSegments()), "/", null, null, null, 62);
                return new C2089(new C2400(new C4162(AbstractC2235.m4287(c1765.f5881.getAssets().open(strM2056))), new C1148(c1765.f5881, 1), new C0976(strM2056)), AbstractC0080.m7959(MimeTypeMap.getSingleton(), strM2056), 3);
            case 1:
                ContentResolver contentResolver = c1765.f5881.getContentResolver();
                if (AbstractC3831.m6874(uri.getAuthority(), "com.android.contacts") && AbstractC3831.m6874(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        C1078.m2277(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && AbstractC3831.m6874(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && AbstractC3831.m6874(pathSegments.get(size - 3), "audio") && AbstractC3831.m6874(pathSegments.get(size - 2), "albums")) {
                    C0181 c0181 = c1765.f5882;
                    AbstractC3831 abstractC3831 = c0181.f670;
                    C0189 c0189 = abstractC3831 instanceof C0189 ? (C0189) abstractC3831 : null;
                    if (c0189 != null) {
                        int i2 = c0189.f704;
                        AbstractC3831 abstractC3832 = c0181.f669;
                        C0189 c01810 = abstractC3832 instanceof C0189 ? (C0189) abstractC3832 : null;
                        if (c01810 != null) {
                            int i3 = c01810.f704;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i2, i3));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        C1078.m2277(uri, "'.", "Unable to find a music thumbnail associated with '");
                        return null;
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        C1078.m2277(uri, "'.", "Unable to open '");
                        return null;
                    }
                }
                return new C2089(new C2400(new C4162(AbstractC2235.m4287(inputStreamOpenInputStream)), new C1148(c1765.f5881, 1), new C1313(uri)), contentResolver.getType(uri), 3);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (AbstractC0684.m1534(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) AbstractC0973.m2043(uri.getPathSegments());
                        if (str == null || (numM8358 = AbstractC4981.m8358(str)) == null) {
                            C0178.m390(uri, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numM8358.intValue();
                        Context context = c1765.f5881;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strM7959 = AbstractC0080.m7959(MimeTypeMap.getSingleton(), charSequence.subSequence(AbstractC0684.m1531('/', 0, 6, charSequence), charSequence.length()).toString());
                        if (!AbstractC3831.m6874(strM7959, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new C2089(new C2400(new C4162(AbstractC2235.m4287(resources.openRawResource(iIntValue, typedValue2))), new C1148(context, 1), new C3335(iIntValue, typedValue2.density, authority)), strM7959, 3);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = AbstractC4225.m7464(context, iIntValue);
                            if (drawable == null) {
                                C1078.m2278(AbstractC5078.m8670(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = AbstractC2365.f7832;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                C1078.m2278(AbstractC5078.m8670(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof C3603)) {
                            z = false;
                        }
                        if (z) {
                            drawable = new BitmapDrawable(context.getResources(), AbstractC1605.m3347(drawable, c1765.f5879, c1765.f5882, c1765.f5877, c1765.f5878));
                        }
                        return new C0960(drawable, z, 3);
                    }
                }
                C0178.m390(uri, "Invalid android.resource URI: ");
                return null;
        }
    }
}
