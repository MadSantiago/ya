package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۥّؑٔؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1139 extends C3216 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final boolean f3983;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM8358 = property != null ? AbstractC4981.m8358(property) : null;
        boolean z = false;
        if (numM8358 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM8358.intValue() >= 9) {
            z = true;
        }
        f3983 = z;
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۥّ */
    public final String mo1371(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p000.C3216
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo1374(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1658) obj) != EnumC1658.f5517) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1658) it.next()).f5518);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
